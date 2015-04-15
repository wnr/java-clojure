(ns greeter.greeters
  (:import (greeter Greeter)))

 (defn polite-greeter []
   (reify
     Greeter
     (greet [this name] (str name ", it's overly pleasent to see your enchanted gem of a face."))))

(defn ghetto-greeter []
  (reify
    Greeter
    (greet [this name] (str "Yo " name ", what's up?"))))

(defn rude-greeter []
  (reify
    Greeter
    (greet [this name] (str name "."))))