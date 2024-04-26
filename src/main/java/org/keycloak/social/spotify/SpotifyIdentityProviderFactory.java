/*
 * Copyright 2024 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.keycloak.social.spotify;

import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.ProviderConfigProperty;
import org.keycloak.provider.ProviderConfigurationBuilder;

import java.util.List;

/**
 * Spotify Identity Provider Factory.
 *
 * @author <a href="mailto:bkuberek@gmail.com">Bastian Kuberek</a>
 */
public class SpotifyIdentityProviderFactory extends AbstractIdentityProviderFactory<SpotifyIdentityProvider>
        implements SocialIdentityProviderFactory<SpotifyIdentityProvider> {

    public static final String PROVIDER_ID = "spotify";

    @Override
    public String getName() {
        return "Spotify";
    }

    @Override
    public SpotifyIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new SpotifyIdentityProvider(session, new SpotifyIdentityProviderConfig(model));
    }

    @Override
    public SpotifyIdentityProviderConfig createConfig() {
        return new SpotifyIdentityProviderConfig();
    }

    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return ProviderConfigurationBuilder.create()
//                .property()
//                .name("allowedGuilds")
//                .type(ProviderConfigProperty.STRING_TYPE)
//                .label("Guild Id(s) to allow federation")
//                .helpText("If you want to allow federation for specific guild, enter the guild id. Please use a comma as a separator for multiple guilds.")
//                .add()
                .build();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}