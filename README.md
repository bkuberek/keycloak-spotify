# keycloak-spotify

Keycloak Social Login extension for Spotify.


## Install

Download `keycloak-spotify-<version>.jar` from [Releases page](https://github.com/bkuberek/keycloak-spotify/releases).
Then deploy it into `$KEYCLOAK_HOME/providers` directory.

## Setup

### Spotify

1. Access [Spotify Developer Portal](https://developer.spotify.com/) and create your application.
2. Get Client ID and Client Secret from the created application.

### Keycloak

1. Add `spotify` Identity Provider in the realm which you want to configure.
2. In the `spotify` identity provider page, set `Client Id` and `Client Secret`.


## Source Build

Clone this repository and run `mvn package`.
You can see `keycloak-spotify-<version>.jar` under `target` directory.


## Licence

[Apache License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0)

