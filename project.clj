(defproject eight-puzzle "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.priority-map "0.0.2"]
                 [org.clojure/math.combinatorics "0.0.3"]
                 [seesaw "1.4.2"]
                 [criterium "0.3.1"]
                 [org.clojure/tools.nrepl "0.2.2"]]
  :injections [(require 'clojure.pprint)]
  :profiles {:dev {:dependencies [[midje "1.5.1"]
                 [bultitude "0.1.7"]      ; <<<<==== fix
                 [lein-midje "2.0.4"]]
                  :plugins [[lein-midje "2.0.4"]]}})
