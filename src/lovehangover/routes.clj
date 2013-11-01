(ns lovehangover.routes
  (:require [lovehangover.model :as m]
            [cheshire.core :as json]))

(defn pics [req]
  (json/generate-string (m/all)))
