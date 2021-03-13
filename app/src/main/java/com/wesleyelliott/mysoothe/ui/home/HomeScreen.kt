package com.wesleyelliott.mysoothe.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.wesleyelliott.mysoothe.data.alignYourBodyData
import com.wesleyelliott.mysoothe.data.alignYourMindData
import com.wesleyelliott.mysoothe.data.favouriteCollections
import com.wesleyelliott.mysoothe.ui.common.MySootheTextField
import com.wesleyelliott.mysoothe.ui.theme.isDarkTheme
import dev.chrisbanes.accompanist.coil.CoilImage
import dev.chrisbanes.accompanist.insets.navigationBarsPadding

@Composable
fun HomeScreen(
    isDarkTheme: Boolean = isDarkTheme()
) {
    val searchText = remember {
        mutableStateOf("")
    }

    Scaffold(
        modifier = Modifier.fillMaxSize().navigationBarsPadding(),
        bottomBar = {
            BottomAppBar(
                backgroundColor = MaterialTheme.colors.background,
                elevation = 8.dp,
            ) {
                Row(
                    modifier = Modifier.height(42.dp).fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Default.Spa, contentDescription = "Home")
                        Text(
                            text = "HOME",
                            style = MaterialTheme.typography.caption,
                            color = MaterialTheme.colors.onBackground,
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile")
                        Text(
                            text = "PROFILE",
                            style = MaterialTheme.typography.caption,
                            color = MaterialTheme.colors.onBackground,
                        )
                    }
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                elevation = FloatingActionButtonDefaults.elevation(
                    defaultElevation = 0.dp,
                    pressedElevation = 8.dp
                )
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = "Play"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true,
    ) {
        Column(
            modifier = Modifier.padding(start = 16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MySootheTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 56.dp),
                value = searchText.value,
                placeholder = "Search",
                leadingIcon = {
                    Icon(
                        modifier = Modifier.size(18.dp),
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search"
                    )
                },
                onValueChange = { searchText.value = it },
            )

            FavouritesCollection()

            AlignYourBody()

            AlignYourMind()
        }
    }
}

@Composable
fun FavouritesCollection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 40.dp),
    ) {
        Text(
            text = "Favourites".toUpperCase(),
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )

        LazyRow(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            for (i in favouriteCollections.indices step 2) {
                val data1 = favouriteCollections[i]
                val data2 = favouriteCollections[i+1]
                item {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        FavouriteCard(
                            imageUrl = data1.imageUrl,
                            title = data1.title
                        )

                        FavouriteCard(
                            imageUrl = data2.imageUrl,
                            title = data2.title
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FavouriteCard(
    imageUrl: String,
    title: String,
) {
    Card(
        modifier = Modifier.size(width = 192.dp, height = 56.dp),
        shape = MaterialTheme.shapes.small,
        elevation = 0.dp
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                modifier = Modifier.size(56.dp),
                data = imageUrl,
                contentScale = ContentScale.FillBounds,
                contentDescription = title,
            )

            Text(
                modifier = Modifier.padding(horizontal = 8.dp),
                text = title,
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onSurface
            )
        }
    }
}

@Composable
fun AlignYourBody(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 40.dp),
    ) {
        Text(
            text = "Align Your Body".toUpperCase(),
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )

        LazyRow(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(alignYourBodyData) { data ->
                RoundedImageWithCaption(
                    imageUrl = data.imageUrl,
                    caption =  data.title
                )
            }
        }
    }
}

@Composable
fun AlignYourMind(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 40.dp),
    ) {
        Text(
            text = "Align Your Mind".toUpperCase(),
            style = MaterialTheme.typography.h2,
            color = MaterialTheme.colors.onBackground
        )

        LazyRow(
            modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(alignYourMindData) { data ->
                RoundedImageWithCaption(imageUrl = data.imageUrl, caption = data.title)
            }
        }
    }
}

@Composable
fun RoundedImageWithCaption(
    imageUrl: String,
    caption: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CoilImage(
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            data = imageUrl,
            contentScale = ContentScale.Crop,
            contentDescription = caption,
        )

        Text(
            modifier = Modifier.paddingFromBaseline(top = 24.dp),
            text = caption,
            style = MaterialTheme.typography.h3,
            color = MaterialTheme.colors.onSurface
        )
    }
}