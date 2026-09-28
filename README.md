# Skyblock Bridge (NeoForge 1.21.1)

Data-driven addon. Recipes live in `src/main/resources/data/skyblock_bridge/recipe/`
(`create/`, `mekanism/`, `draconic/`); each one only loads if its source mod is installed.

## Build
Requires JDK 21. Gradle wrapper files are not bundled; either copy `gradlew`, `gradlew.bat`
and `gradle/` from the official NeoForge MDK for 1.21.1, or run `gradle wrapper` once
(Gradle 8.10+), then:

    ./gradlew build          # jar ends up in build/libs/
    ./gradlew runClient      # optional dev client

## Test in-game
Put the built jar in `mods/` with Create, Mekanism etc. Check `logs/latest.log` for lines
mentioning `skyblock_bridge` (recipe parse errors show up there) and use JEI/EMI to see the recipes.

## GitHub Actions
`.github/workflows/build.yml` builds on every push (JDK 21 + Gradle 8.10.2, no wrapper needed).
Download the jar from the run's **Artifacts**, or push a tag like `v3.0.0` to attach it to a Release.
