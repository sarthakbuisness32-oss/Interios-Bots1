# Interios Bots

Starter project for a Paper 1.21.11 plugin targeting Java 21.

## Build

The included GitHub Actions workflow builds the project on pushes to `main`/`master` or by manual dispatch. Download the `InteriosBots-JAR` artifact from the successful workflow run.

## Current status

This is a clean, compilable project scaffold. It registers `/interiobot help` and `/interiobot status`. The `mass_spawn`, NPC creation/removal, and PvP AI features are intentionally marked as planned and are not implemented yet. FancyNpcs is detected as an optional server plugin but is not yet called through its API.

## Server requirements

- Paper 1.21.11
- Java 21
- FancyNpcs will be required for the planned player-NPC integration once that API integration is added.
