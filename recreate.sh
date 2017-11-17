#!/usr/bin/env bash
oc login
oc project concha-drum-lab
cd ./.openshift/na1/concha/
oc create -f is.yaml
oc create -f bc.yaml
oc create -f dc.yaml
oc create -f route.yaml
oc create -f svc.yaml
cd -
oc start-build concha-drum-lab --from-dir=. -F