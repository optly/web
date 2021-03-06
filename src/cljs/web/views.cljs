(ns web.views
    (:require [re-frame.core :as re-frame]))

(defn navbar-panel
  [name]
  [:nav.navbar.navbar-toggleable-md.navbar-inverse.bg-inverse.fixed-top
   {:key "navigation-bar"}
   [:button.navbar-toggler.navbar-toggler-right
    {:type "button"
     :data-toggle "collapse"
     :data-target "#navbarsExampleDefault"
     :aria-controls "navbarsExampleDefault"
     :aria-expanded "false"
     :aria-label "Toggle navigation"}
    [:span {:class "navbar-toggler-icon"}]]
   [:a {:class "navbar-brand", :href "/"} @name]])

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div
       (list
         (navbar-panel name)
         [:div.container-fluid {:key "heading"}
          [:h1 "Hello from " @name]])])))
