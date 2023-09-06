;; GENERATED by script/update-project.clj, DO NOT EDIT
;; To change dependencies, update deps.edn and run script/update-project.clj.
;; To change other things, edit project.template.clj and run script/update-project.clj.

(defproject clj-kondo "2023.09.06"
  :description "A linter for Clojure that sparks joy."
  :url "https://github.com/clj-kondo/clj-kondo"
  :scm {:name "git"
        :url "https://github.com/clj-kondo/clj-kondo"}
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"}
  :source-paths ["src" "parser" "inlined"]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.cognitect/transit-clj "1.0.333"]
                 [io.replikativ/datalog-parser "0.2.25"]
                 [cheshire/cheshire "5.11.0"]
                 [nrepl/bencode "1.1.0"]
                 [org.babashka/sci "0.7.38"]
                 [babashka/fs "0.2.16"]
                 [org.ow2.asm/asm "9.4"]
                 [com.github.javaparser/javaparser-core "3.25.3"]]
  ;; :global-vars {*print-namespace-maps* false}
  :profiles {:clojure-1.9.0 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :clojure-1.10.2 {:dependencies [[org.clojure/clojure "1.10.2"]]}
             :test {:dependencies [[nubank/matcher-combinators "3.5.1"]
                                   [org.clojure/clojurescript "1.11.54"]
                                   [clj-commons/conch "0.9.2"]
                                   [org.clojure/tools.deps.alpha "0.12.1048"]
                                   [jonase/eastwood "1.4.0"]
                                   [babashka/process "0.5.21"]
                                   [borkdude/missing.test.assertions "0.0.2"]]
                    :source-paths ["src" "parser" "inlined" "extract"]}
             :uberjar {:dependencies [[com.github.clj-easy/graal-build-time "0.1.0"]]
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"
                                  "-Dclojure.spec.skip-macros=true"]
                       :main clj-kondo.main
                       :aot [clj-kondo.main]}}
  :aliases {"clj-kondo" ["run" "-m" "clj-kondo.main"]}
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]])
