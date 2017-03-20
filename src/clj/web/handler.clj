(ns web.handler
  (:require [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [resources not-found]]
            [ring.util.response :refer [resource-response]]
            [ring.middleware.reload :refer [wrap-reload]]))

(defroutes routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (resources "/")
  (not-found (resource-response "index.html" {:root "public"})))

(def dev-handler (-> #'routes wrap-reload))

(def handler routes)
