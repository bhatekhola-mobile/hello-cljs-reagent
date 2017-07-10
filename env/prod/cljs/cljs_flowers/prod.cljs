(ns cljs-flowers.prod
  (:require [cljs-flowers.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
