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

import java.util.Date;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {

    private Long id;
    private Boolean readable;
    private String isrc;
    private String title;
    private String title_short;
    private String title_version;
    private String share;
    private boolean explicit_lyrics;
    private List<String> contributors;
    private boolean unseen;
    private String release_date;
    private String link;
    private Integer duration;
    private Integer rank;
    private String preview;
    private Artist artist;
    private Album album;
    private String type;
    private Integer track_position;
    private Integer disk_number;
    private Double bpm;
    private Double gain;
    private String[] available_countries;
    private Date time_add;

}
