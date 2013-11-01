(ns lovehangover.model
  (:require [clojure.java.jdbc :as j]
            [clojure.java.jdbc.sql :as s]))

(defn db [] (or (System/getenv "DATABASE_URL")
                {:classname "org.postgresql.Driver"
                :subprotocol "postgresql"
                :subname "//localhost:5432/lovehangover"
                :user "postgres"
                :password "chango"}))

(defn all []
  (j/query (db)  (s/select * :uploads)))
