(defproject joplin.cassandra "0.2.15"
  :description "Cassandra support for Joplin"
  :url "http://github.com/juxt/joplin"
  :scm {:name "git"
        :url "https://github.com/juxt/joplin"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clojurewerkz/cassaforte "2.0.0"]
                 [joplin.core "0.2.15"]])
