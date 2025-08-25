
# Mock Java Repo

This is a simple **Java + Maven project** created for demo purposes.  
It has a `pom.xml` with a couple of dependencies (Jackson + JUnit).  

## How to run locally

```bash
mvn compile
mvn test
mvn exec:java -Dexec.mainClass="com.example.app.App"
```

## Why this repo?

- To demo the **Dependency Upgrade Butler** idea.  
- Dependabot will notice that `jackson-databind` is on `2.15.0` and suggest updates.  
- CI will run `mvn test` when PRs are created.  

You don’t need to write any code — it’s all set up to show automated updates.
