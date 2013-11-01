(defproject lovehangover "0.1.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "For Isa."
  :url "http://www.lovehangover.com.ar"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [postgresql/postgresql "8.4-702.jdbc4"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [cheshire "5.2.0"]]
  :plugins [[lein-ring "0.8.7"]]
  :ring {:handler lovehangover.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
