/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zeloon.deezer.domain;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Playlist {

    private Long id;
    private String title;
    private String description;
    private Integer duration;

    @JsonProperty(value = "public")
    private Boolean is_public;

    private Boolean is_loved_track;
    private Boolean collaborative;
    private Integer rating;
    private String link;
    private String picture;
    private String picture_small;
    private String picture_medium;
    private String picture_big;
    private String picture_xl;

    private String checksum;
    private String tracklist;
    private Creator creator;
    private String type;
    private Tracks tracks;
    private Integer nb_tracks;
    private Integer fans;

}
