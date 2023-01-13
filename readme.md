# Chaos Scenario

## Deploy back-end service
```
kubectl apply -f nginx.yaml
```

## Deploy front-end service
```
kubectl apply -f demo200.yaml
```

## Run Litmus scenario -- deletepodofnginx-1673567591.yaml
## Change replicas of nginx to 1, then rerun the scenario again.
