(ns lovehangover.web
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [lovehangover.routes :as r]
            [ring.adapter.jetty :as j]))

(defroutes app-routes
  (GET "/" [] r/pics)
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))

(defn -main [& [port]]
  (let [port (Integer. (or port 3000))]
    (j/run-jetty app {:port port})))
