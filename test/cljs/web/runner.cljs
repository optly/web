(ns web.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [web.core-test]))

(doo-tests 'web.core-test)
