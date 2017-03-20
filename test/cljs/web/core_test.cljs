(ns web.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [web.core :as core]))

(deftest fake-test
  (testing "1 is equal to 1"
    (is (= 1 1))))
