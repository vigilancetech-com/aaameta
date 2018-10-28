(ns app.server
 (:require
  [meta.server :as svr]))

(def app
  (-> (svr/app)
 ;; feathers services
    ))

(defn init []
  (svr/init! app))  ;; was start
