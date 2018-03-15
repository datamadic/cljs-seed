(ns w3.core
  (:require [reagent.core :as r]
            [w3.views.thing :as t]
            [goog.net.XhrIo :as XhrIo]
            [clojure.core.async :as async]
            ))

(enable-console-print!)

(println "Hello world!")

(def x (r/atom 0))
(def ret (r/atom "not here yet"))

(defn counter []
  [:div
   {:on-click #(swap! x inc)}
   "ooh this " @x])

;"https://google.com/"

(defn getx []
  (XhrIo/send "http://localhost:8000/"
              (fn [e]
                (println e)
                (let [xhr (.-target e)
                      obj (.getResponseText xhr)]
                  (reset! ret obj)))))

(defn simple-component []
  [:div
   [:p "I am a component!"]
   [:p.someclass
    "I have " [:strong "bold"]
    [:span {:style {:color "red"}} " and red! oh my "] "text."]
   [counter]
   [t/pthing @x]
   [:div {:on-click getx } "get it?"]
   [:div @ret]])


(r/render [simple-component]
          (js/document.getElementById "app"))

