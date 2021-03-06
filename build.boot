;; Powered by Meta ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; dependency
(set-env!           :asset-paths  #{"resources"}
                    :source-paths #{"src"}

                    :dependencies '[[org.clojure/clojure         "1.10.0-alpha6"]
                          [org.clojure/clojurescript   "1.10.339"]
                          [degree9/boot-shadow "2.6.6-SNAPSHOT"]
                          [degree9/boot-electron       "0.3.0-SNAPSHOT"]
                          [degree9/boot-npm            "LATEST"]
                          [degree9/boot-exec           "LATEST"]
                          [degree9/meta                "0.4.0-SNAPSHOT"]])


;; require
(require '[meta.boot :as m]
         '[degree9.boot-shadow :as s]
         '[degree9.boot-exec :as be]
         '[degree9.boot-electron :as e])

;; init
(m/initialize)
;;(e/electron)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Project ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(deftask develop
  "Start local development."
  []
  (comp
    (m/microservice)))

(deftask build
  "Start production build."
  []
  (m/compile))
