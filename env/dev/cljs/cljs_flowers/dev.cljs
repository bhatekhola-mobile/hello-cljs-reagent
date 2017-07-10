(ns ^:figwheel-no-load cljs-flowers.dev
  (:require
    [cljs-flowers.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
