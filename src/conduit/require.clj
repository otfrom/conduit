(ns conduit.require
  (:use conduit.core)
  (:refer-clojure :exclude [case comp juxt reduce map]))

(def proc a-arr)
(def nth a-nth)
(def case a-selectp)
(def pipe a-comp)
(def split a-all)
(def juxt a-par)
(def reduce a-loop)
(def map conduit-map)
(def do conduit-do)
(defmacro def* [name args & body]
  `(def ~name (conduit-proc (fn ~name ~args ~@body))))
(defmacro def [name args & body]
  `(def ~name (a-arr (fn ~name ~args ~@body))))

