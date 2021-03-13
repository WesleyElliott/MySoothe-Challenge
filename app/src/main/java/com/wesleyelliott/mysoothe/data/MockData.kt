/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wesleyelliott.mysoothe.data

data class HomeData(
    val imageUrl: String,
    val title: String
)

val favouriteCollections = listOf(
    HomeData(
        "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Short mantras"
    ),
    HomeData(
        "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Nature meditations"
    ),
    HomeData(
        "https://images.pexels.com/photos/1557238/pexels-photo-1557238.jpeg?cs=srgb&dl=pexels-jim-1557238.jpg&fm=jpg",
        "Stress and anxiety"
    ),
    HomeData(
        "https://images.pexels.com/photos/1029604/pexels-photo-1029604.jpeg?cs=srgb&dl=pexels-scott-webb-1029604.jpg&fm=jpg",
        "Self-massage"
    ),
    HomeData(
        "https://images.pexels.com/photos/3560044/pexels-photo-3560044.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Overwhelmed"
    ),
    HomeData(
        "https://images.pexels.com/photos/924824/pexels-photo-924824.jpeg?cs=srgb&dl=pexels-jakub-novacek-924824.jpg&fm=jpg",
        "Nightly wind down"
    ),
)

val alignYourBodyData = listOf(
    HomeData(
        "https://images.pexels.com/photos/317157/pexels-photo-317157.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Inversions"
    ),
    HomeData(
        "https://images.pexels.com/photos/1812964/pexels-photo-1812964.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Quick yoga"
    ),
    HomeData(
        "https://images.pexels.com/photos/4056723/pexels-photo-4056723.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Stretching"
    ),
    HomeData(
        "https://images.pexels.com/photos/4662438/pexels-photo-4662438.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Tabata"
    ),
    HomeData(
        "https://images.pexels.com/photos/999309/pexels-photo-999309.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "HIIT"
    ),
    HomeData(
        "https://images.pexels.com/photos/396133/pexels-photo-396133.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "Pre-natal yoga"
    )
)

val alignYourMindData = listOf(
    HomeData(
        "https://images.pexels.com/photos/3822622/pexels-photo-3822622.jpeg?auto=compress&cs=tinysrgb&dpr=3&h=750&w=1260",
        "Meditate"
    ),
    HomeData(
        "https://images.pexels.com/photos/3094230/pexels-photo-3094230.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "With kids"
    ),
    HomeData(
        "https://images.pexels.com/photos/4498318/pexels-photo-4498318.jpeg?cs=srgb&dl=pexels-karolina-grabowska-4498318.jpg&fm=jpg",
        "Aromatherapy"
    ),
    HomeData(
        "https://images.pexels.com/photos/1241348/pexels-photo-1241348.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "On the go"
    ),
    HomeData(
        "https://images.pexels.com/photos/4056535/pexels-photo-4056535.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "With pets"
    ),
    HomeData(
        "https://images.pexels.com/photos/897817/pexels-photo-897817.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
        "High stress"
    )
)
