package com.task.updayTask.data

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.task.updayTask.data.network.ApiInterface
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.net.HttpURLConnection

const val response : String = """{
    "page": 1,
    "per_page": 20,
    "total_count": 2871943,
    "search_id": "db5b5afe-19f7-46c3-8d24-f1d070d64c71",
    "data": [
        {
            "id": "1973821043",
            "aspect": 1.5005,
            "assets": {
                "preview": {
                    "height": 299,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/223270637/1973821043/stock-photo-fresh-summer-salad-with-prawn-strawberry-avocado-lime-and-olive-summer-salad-healthy-eating-1973821043.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb1.shutterstock.com/thumb_small/223270637/1973821043/stock-photo-fresh-summer-salad-with-prawn-strawberry-avocado-lime-and-olive-summer-salad-healthy-eating-1973821043.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_large/223270637/1973821043/stock-photo-fresh-summer-salad-with-prawn-strawberry-avocado-lime-and-olive-summer-salad-healthy-eating-1973821043.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/fresh-summer-salad-prawnstrawberryavocadolime-olivesummer-260nw-1973821043.jpg",
                    "width": 391
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1973821043/watermark_1000/483837978f1e54cfb818a71956d4c459/preview_1000-1973821043.jpg",
                    "width": 1000,
                    "height": 666
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-fresh-summer-salad-with-prawn-strawberry-avocado-lime-and-olive-summer-salad-healthy-eating-1973821043.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "223270637"
            },
            "description": "Fresh summer salad with prawn,strawberry,avocado,lime and olive.Summer salad,healthy eating",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1975069022",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/228986375/1975069022/stock-photo-solo-woman-drink-coffee-with-relax-and-wellbeing-feel-with-mountain-background-1975069022.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb9.shutterstock.com/thumb_small/228986375/1975069022/stock-photo-solo-woman-drink-coffee-with-relax-and-wellbeing-feel-with-mountain-background-1975069022.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb9.shutterstock.com/thumb_large/228986375/1975069022/stock-photo-solo-woman-drink-coffee-with-relax-and-wellbeing-feel-with-mountain-background-1975069022.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/solo-woman-drink-coffee-relax-260nw-1975069022.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1975069022/watermark_1000/3e63f98b693f0e83f7e8ba0fca4f0a38/preview_1000-1975069022.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-solo-woman-drink-coffee-with-relax-and-wellbeing-feel-with-mountain-background-1975069022.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "228986375"
            },
            "description": "solo woman drink coffee with relax and wellbeing feel with mountain background",
            "image_type": "photo",
            "has_model_release": true,
            "media_type": "image"
        },
        {
            "id": "1966413823",
            "aspect": 0.6667,
            "assets": {
                "preview": {
                    "height": 450,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/228984501/1966413823/stock-photo-amazing-pink-sand-beach-in-budelli-island-maddalena-archipelago-sardinia-italy-1966413823.jpg",
                    "width": 300
                },
                "small_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_small/228984501/1966413823/stock-photo-amazing-pink-sand-beach-in-budelli-island-maddalena-archipelago-sardinia-italy-1966413823.jpg",
                    "width": 67
                },
                "large_thumb": {
                    "height": 150,
                    "url": "https://thumb1.shutterstock.com/thumb_large/228984501/1966413823/stock-photo-amazing-pink-sand-beach-in-budelli-island-maddalena-archipelago-sardinia-italy-1966413823.jpg",
                    "width": 100
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/amazing-pink-sand-beach-budelli-260nw-1966413823.jpg",
                    "width": 173
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1966413823/watermark_1000/cb6a5e9f002b29d88b125188f5e0688c/preview_1000-1966413823.jpg",
                    "width": 667,
                    "height": 1000
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-amazing-pink-sand-beach-in-budelli-island-maddalena-archipelago-sardinia-italy-1966413823.jpg",
                    "width": 1000,
                    "height": 1500
                }
            },
            "contributor": {
                "id": "228984501"
            },
            "description": "Amazing pink sand beach in Budelli Island, Maddalena Archipelago, Sardinia, Italy",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1972480916",
            "aspect": 0.7374,
            "assets": {
                "preview": {
                    "height": 450,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/224074085/1972480916/stock-photo-wedding-archway-with-flowers-arranged-for-a-wedding-ceremony-1972480916.jpg",
                    "width": 331
                },
                "small_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_small/224074085/1972480916/stock-photo-wedding-archway-with-flowers-arranged-for-a-wedding-ceremony-1972480916.jpg",
                    "width": 74
                },
                "large_thumb": {
                    "height": 150,
                    "url": "https://thumb1.shutterstock.com/thumb_large/224074085/1972480916/stock-photo-wedding-archway-with-flowers-arranged-for-a-wedding-ceremony-1972480916.jpg",
                    "width": 111
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/wedding-archway-flowers-arranged-ceremony-260nw-1972480916.jpg",
                    "width": 191
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1972480916/watermark_1000/d740d7cbcfb5f44827bc8ec3b028526b/preview_1000-1972480916.jpg",
                    "width": 737,
                    "height": 1000
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-wedding-archway-with-flowers-arranged-for-a-wedding-ceremony-1972480916.jpg",
                    "width": 1106,
                    "height": 1500
                }
            },
            "contributor": {
                "id": "224074085"
            },
            "description": "Wedding archway with flowers arranged for a wedding ceremony",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1964873407",
            "aspect": 1,
            "assets": {
                "preview": {
                    "height": 450,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/223265567/1964873407/stock-photo-male-legs-stacking-in-round-on-pastel-geometrical-background-modern-design-contemporary-art-1964873407.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 100,
                    "url": "https://thumb7.shutterstock.com/thumb_small/223265567/1964873407/stock-photo-male-legs-stacking-in-round-on-pastel-geometrical-background-modern-design-contemporary-art-1964873407.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 150,
                    "url": "https://thumb7.shutterstock.com/thumb_large/223265567/1964873407/stock-photo-male-legs-stacking-in-round-on-pastel-geometrical-background-modern-design-contemporary-art-1964873407.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/male-legs-stacking-round-on-260nw-1964873407.jpg",
                    "width": 260
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1964873407/watermark_1000/e4f12413dfb769dbd12855891173a8ba/preview_1000-1964873407.jpg",
                    "width": 1000,
                    "height": 1000
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-male-legs-stacking-in-round-on-pastel-geometrical-background-modern-design-contemporary-art-1964873407.jpg",
                    "width": 1500,
                    "height": 1500
                }
            },
            "contributor": {
                "id": "223265567"
            },
            "description": "Male legs stacking in round on pastel geometrical background. Modern design, contemporary art collage. Inspiration, idea, trendy urban magazine style. Negative space to insert your text or ad",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1936186630",
            "aspect": 2.1201,
            "assets": {
                "preview": {
                    "height": 212,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/301109095/1936186630/stock-vector-floral-branch-hand-drawn-wedding-herb-plant-and-monogram-with-elegant-leaves-for-invitation-save-1936186630.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 47,
                    "url": "https://thumb1.shutterstock.com/thumb_small/301109095/1936186630/stock-vector-floral-branch-hand-drawn-wedding-herb-plant-and-monogram-with-elegant-leaves-for-invitation-save-1936186630.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 71,
                    "url": "https://thumb1.shutterstock.com/thumb_large/301109095/1936186630/stock-vector-floral-branch-hand-drawn-wedding-herb-plant-and-monogram-with-elegant-leaves-for-invitation-save-1936186630.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-vector/floral-branch-hand-drawn-wedding-260nw-1936186630.jpg",
                    "width": 552
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1936186630/watermark_1000/81399a7524cfe760dfafacac90226387/preview_1000-1936186630.jpg",
                    "width": 1000,
                    "height": 472
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-vector-floral-branch-hand-drawn-wedding-herb-plant-and-monogram-with-elegant-leaves-for-invitation-save-1936186630.jpg",
                    "width": 1500,
                    "height": 708
                }
            },
            "contributor": {
                "id": "301109095"
            },
            "description": "Floral branch. Hand drawn wedding herb, plant and monogram with elegant leaves for invitation save the date card design. Botanical rustic trendy greenery vector",
            "image_type": "vector",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1971338468",
            "aspect": 0.6667,
            "assets": {
                "preview": {
                    "height": 450,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/223270637/1971338468/stock-photo-delicious-summer-tartlets-with-raspberries-and-yoghurt-yellow-and-red-raspberries-healthy-dessert-1971338468.jpg",
                    "width": 300
                },
                "small_thumb": {
                    "height": 100,
                    "url": "https://thumb9.shutterstock.com/thumb_small/223270637/1971338468/stock-photo-delicious-summer-tartlets-with-raspberries-and-yoghurt-yellow-and-red-raspberries-healthy-dessert-1971338468.jpg",
                    "width": 67
                },
                "large_thumb": {
                    "height": 150,
                    "url": "https://thumb9.shutterstock.com/thumb_large/223270637/1971338468/stock-photo-delicious-summer-tartlets-with-raspberries-and-yoghurt-yellow-and-red-raspberries-healthy-dessert-1971338468.jpg",
                    "width": 100
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/delicious-summer-tartlets-raspberries-yoghurt-260nw-1971338468.jpg",
                    "width": 173
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1971338468/watermark_1000/2844a9c6e3799b7ff26291ea9ccbee99/preview_1000-1971338468.jpg",
                    "width": 667,
                    "height": 1000
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-delicious-summer-tartlets-with-raspberries-and-yoghurt-yellow-and-red-raspberries-healthy-dessert-1971338468.jpg",
                    "width": 1000,
                    "height": 1500
                }
            },
            "contributor": {
                "id": "223270637"
            },
            "description": "Delicious summer tartlets with raspberries and yoghurt. Yellow and red raspberries. Healthy dessert. Keto dessert.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1974854414",
            "aspect": 3.6976,
            "assets": {
                "preview": {
                    "height": 121,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/301517351/1974854414/stock-vector-big-data-flow-technology-and-science-vector-background-tech-abstraction-with-lines-electronics-and-1974854414.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 27,
                    "url": "https://thumb7.shutterstock.com/thumb_small/301517351/1974854414/stock-vector-big-data-flow-technology-and-science-vector-background-tech-abstraction-with-lines-electronics-and-1974854414.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 41,
                    "url": "https://thumb7.shutterstock.com/thumb_large/301517351/1974854414/stock-vector-big-data-flow-technology-and-science-vector-background-tech-abstraction-with-lines-electronics-and-1974854414.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-vector/big-data-flow-technology-science-260nw-1974854414.jpg",
                    "width": 967
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1974854414/watermark_1000/3439e91f00e8a0a89d3499d11f2f9f41/preview_1000-1974854414.jpg",
                    "width": 1000,
                    "height": 270
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-vector-big-data-flow-technology-and-science-vector-background-tech-abstraction-with-lines-electronics-and-1974854414.jpg",
                    "width": 1500,
                    "height": 406
                }
            },
            "contributor": {
                "id": "301517351"
            },
            "description": "Big data flow technology and science vector background, tech abstraction with lines electronics and digital style in 3D dimensional perspective, abstract illustration.",
            "image_type": "vector",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1986609188",
            "aspect": 2,
            "assets": {
                "preview": {
                    "height": 225,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/301109095/1986609188/stock-vector-different-container-with-hazard-chemical-liquid-in-row-line-compressed-gas-and-oil-safety-tank-1986609188.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 50,
                    "url": "https://thumb9.shutterstock.com/thumb_small/301109095/1986609188/stock-vector-different-container-with-hazard-chemical-liquid-in-row-line-compressed-gas-and-oil-safety-tank-1986609188.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 75,
                    "url": "https://thumb9.shutterstock.com/thumb_large/301109095/1986609188/stock-vector-different-container-with-hazard-chemical-liquid-in-row-line-compressed-gas-and-oil-safety-tank-1986609188.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-vector/different-container-hazard-chemical-liquid-260nw-1986609188.jpg",
                    "width": 520
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1986609188/watermark_1000/54e469e08c98583122987a3d5936a228/preview_1000-1986609188.jpg",
                    "width": 1000,
                    "height": 500
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-vector-different-container-with-hazard-chemical-liquid-in-row-line-compressed-gas-and-oil-safety-tank-1986609188.jpg",
                    "width": 1500,
                    "height": 750
                }
            },
            "contributor": {
                "id": "301109095"
            },
            "description": "Different container with hazard chemical liquid in row line. Compressed gas and oil safety tank with dangerous radioactive flammable substance vector illustration isolated on white background",
            "image_type": "vector",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1947304768",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/228986375/1947304768/stock-photo-the-view-through-the-glass-of-dry-white-gypsophila-flowers-cinematic-tone-1947304768.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb9.shutterstock.com/thumb_small/228986375/1947304768/stock-photo-the-view-through-the-glass-of-dry-white-gypsophila-flowers-cinematic-tone-1947304768.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb9.shutterstock.com/thumb_large/228986375/1947304768/stock-photo-the-view-through-the-glass-of-dry-white-gypsophila-flowers-cinematic-tone-1947304768.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/view-through-glass-dry-white-260nw-1947304768.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1947304768/watermark_1000/6043a164931c2d168df8163175a90f67/preview_1000-1947304768.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-the-view-through-the-glass-of-dry-white-gypsophila-flowers-cinematic-tone-1947304768.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "228986375"
            },
            "description": "The view through the glass of dry white gypsophila flowers, Cinematic tone.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1973244086",
            "aspect": 0.6667,
            "assets": {
                "preview": {
                    "height": 450,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/223270637/1973244086/stock-photo-strawberry-desserts-in-cups-summer-snack-strawberry-yogurt-granola-1973244086.jpg",
                    "width": 300
                },
                "small_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_small/223270637/1973244086/stock-photo-strawberry-desserts-in-cups-summer-snack-strawberry-yogurt-granola-1973244086.jpg",
                    "width": 67
                },
                "large_thumb": {
                    "height": 150,
                    "url": "https://thumb1.shutterstock.com/thumb_large/223270637/1973244086/stock-photo-strawberry-desserts-in-cups-summer-snack-strawberry-yogurt-granola-1973244086.jpg",
                    "width": 100
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/strawberry-desserts-cups-summer-snack-260nw-1973244086.jpg",
                    "width": 173
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1973244086/watermark_1000/d1547ad50e07bd7e840741c88969bdf4/preview_1000-1973244086.jpg",
                    "width": 667,
                    "height": 1000
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-strawberry-desserts-in-cups-summer-snack-strawberry-yogurt-granola-1973244086.jpg",
                    "width": 1000,
                    "height": 1500
                }
            },
            "contributor": {
                "id": "223270637"
            },
            "description": "Strawberry desserts in cups. Summer snack strawberry yogurt granola.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1931260166",
            "aspect": 1.3333,
            "assets": {
                "preview": {
                    "height": 337,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/224074813/1931260166/stock-photo--d-illustration-beach-umbrella-travel-suitcase-beach-ball-palms-and-smartphone-travel-and-1931260166.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 75,
                    "url": "https://thumb1.shutterstock.com/thumb_small/224074813/1931260166/stock-photo--d-illustration-beach-umbrella-travel-suitcase-beach-ball-palms-and-smartphone-travel-and-1931260166.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 113,
                    "url": "https://thumb1.shutterstock.com/thumb_large/224074813/1931260166/stock-photo--d-illustration-beach-umbrella-travel-suitcase-beach-ball-palms-and-smartphone-travel-and-1931260166.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-illustration/3d-illustration-beach-umbrella-travel-260nw-1931260166.jpg",
                    "width": 347
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1931260166/watermark_1000/98d892e149510c6708484708bea8bf33/preview_1000-1931260166.jpg",
                    "width": 1000,
                    "height": 750
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo--d-illustration-beach-umbrella-travel-suitcase-beach-ball-palms-and-smartphone-travel-and-1931260166.jpg",
                    "width": 1500,
                    "height": 1125
                }
            },
            "contributor": {
                "id": "224074813"
            },
            "description": "3d illustration. Beach umbrella, Travel suitcase, beach ball, palms and Smartphone. Travel and Summer vacation concept.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1938079048",
            "aspect": 1.5001,
            "assets": {
                "preview": {
                    "height": 299,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/301131357/1938079048/stock-photo-luxury-canadian-house-completely-renovated-furnished-and-staged-with-basement-deck-backyard-and-1938079048.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb9.shutterstock.com/thumb_small/301131357/1938079048/stock-photo-luxury-canadian-house-completely-renovated-furnished-and-staged-with-basement-deck-backyard-and-1938079048.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb9.shutterstock.com/thumb_large/301131357/1938079048/stock-photo-luxury-canadian-house-completely-renovated-furnished-and-staged-with-basement-deck-backyard-and-1938079048.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/luxury-canadian-house-completely-renovated-260nw-1938079048.jpg",
                    "width": 391
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1938079048/watermark_1000/9eec3f318a3ded572ab4d521cdc9d794/preview_1000-1938079048.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-luxury-canadian-house-completely-renovated-furnished-and-staged-with-basement-deck-backyard-and-1938079048.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "301131357"
            },
            "description": "Luxury Canadian House Completely Renovated, Furnished and Staged with Basement, Deck, Backyard and Garage for Sale",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1931260157",
            "aspect": 1.3333,
            "assets": {
                "preview": {
                    "height": 337,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/224074813/1931260157/stock-photo--d-illustration-palms-and-beach-with-chair-beach-umbrella-and-smartphone-on-sand-travel-and-1931260157.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 75,
                    "url": "https://thumb7.shutterstock.com/thumb_small/224074813/1931260157/stock-photo--d-illustration-palms-and-beach-with-chair-beach-umbrella-and-smartphone-on-sand-travel-and-1931260157.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 113,
                    "url": "https://thumb7.shutterstock.com/thumb_large/224074813/1931260157/stock-photo--d-illustration-palms-and-beach-with-chair-beach-umbrella-and-smartphone-on-sand-travel-and-1931260157.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-illustration/3d-illustration-palms-beach-chair-260nw-1931260157.jpg",
                    "width": 347
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1931260157/watermark_1000/8638ae586747b14fbe1e7a500e2a901f/preview_1000-1931260157.jpg",
                    "width": 1000,
                    "height": 750
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo--d-illustration-palms-and-beach-with-chair-beach-umbrella-and-smartphone-on-sand-travel-and-1931260157.jpg",
                    "width": 1500,
                    "height": 1125
                }
            },
            "contributor": {
                "id": "224074813"
            },
            "description": "3d illustration. Palms and beach with chair, Beach umbrella and Smartphone on sand. Travel and Summer vacation concept.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1913012410",
            "aspect": 1.3333,
            "assets": {
                "preview": {
                    "height": 337,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/224074813/1913012410/stock-photo--d-illustration-smartphone-with-credit-cards-on-the-side-online-shop-and-e-commerce-concept-1913012410.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 75,
                    "url": "https://thumb1.shutterstock.com/thumb_small/224074813/1913012410/stock-photo--d-illustration-smartphone-with-credit-cards-on-the-side-online-shop-and-e-commerce-concept-1913012410.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 113,
                    "url": "https://thumb1.shutterstock.com/thumb_large/224074813/1913012410/stock-photo--d-illustration-smartphone-with-credit-cards-on-the-side-online-shop-and-e-commerce-concept-1913012410.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-illustration/3d-illustration-smartphone-credit-cards-260nw-1913012410.jpg",
                    "width": 347
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1913012410/watermark_1000/e8e92652ec71a33edd1c369c1d9023db/preview_1000-1913012410.jpg",
                    "width": 1000,
                    "height": 750
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo--d-illustration-smartphone-with-credit-cards-on-the-side-online-shop-and-e-commerce-concept-1913012410.jpg",
                    "width": 1500,
                    "height": 1125
                }
            },
            "contributor": {
                "id": "224074813"
            },
            "description": "3D Illustration. Smartphone with credit cards on the side. Online shop and e-commerce concept.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1936655347",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/228984501/1936655347/stock-photo-indian-summer-beautiful-autumn-landscape-with-yellow-trees-and-sun-colorful-foliage-in-the-park-1936655347.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb7.shutterstock.com/thumb_small/228984501/1936655347/stock-photo-indian-summer-beautiful-autumn-landscape-with-yellow-trees-and-sun-colorful-foliage-in-the-park-1936655347.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb7.shutterstock.com/thumb_large/228984501/1936655347/stock-photo-indian-summer-beautiful-autumn-landscape-with-yellow-trees-and-sun-colorful-foliage-in-the-park-1936655347.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/indian-summer-beautiful-autumn-landscape-260nw-1936655347.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1936655347/watermark_1000/0db01ea5e7167112bd202e13979cf0be/preview_1000-1936655347.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-indian-summer-beautiful-autumn-landscape-with-yellow-trees-and-sun-colorful-foliage-in-the-park-1936655347.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "228984501"
            },
            "description": "Indian summer. Beautiful autumn landscape with yellow trees and sun. Colorful foliage in the park. Falling leaves natural background. ",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1931413580",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/301109095/1931413580/stock-vector-sale-tag-speech-bubble-red-shape-with-different-discount-set-1931413580.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb1.shutterstock.com/thumb_small/301109095/1931413580/stock-vector-sale-tag-speech-bubble-red-shape-with-different-discount-set-1931413580.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_large/301109095/1931413580/stock-vector-sale-tag-speech-bubble-red-shape-with-different-discount-set-1931413580.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-vector/sale-tag-speech-bubble-red-260nw-1931413580.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1931413580/watermark_1000/7bcc55928106acf54dcead49cb145cda/preview_1000-1931413580.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-vector-sale-tag-speech-bubble-red-shape-with-different-discount-set-1931413580.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "301109095"
            },
            "description": "Sale tag speech bubble red shape with different discount set. 10, 20, 25, 30, 35, 40, 50, 60, 70, 80 and 90 percent price clearance sticker badge banner label vector illustration isolated on white",
            "image_type": "vector",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1965801202",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/228984501/1965801202/stock-photo-blue-sky-autumn-landscape-with-bright-colorful-leaves-indian-summer-foliage-1965801202.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb9.shutterstock.com/thumb_small/228984501/1965801202/stock-photo-blue-sky-autumn-landscape-with-bright-colorful-leaves-indian-summer-foliage-1965801202.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb9.shutterstock.com/thumb_large/228984501/1965801202/stock-photo-blue-sky-autumn-landscape-with-bright-colorful-leaves-indian-summer-foliage-1965801202.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/blue-sky-autumn-landscape-bright-260nw-1965801202.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1965801202/watermark_1000/ccd3125f3bf87261be623f36383a0692/preview_1000-1965801202.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-blue-sky-autumn-landscape-with-bright-colorful-leaves-indian-summer-foliage-1965801202.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "228984501"
            },
            "description": "Blue sky. autumn landscape with bright colorful leaves. Indian summer. foliage.",
            "image_type": "photo",
            "has_model_release": false,
            "media_type": "image"
        },
        {
            "id": "1963795600",
            "aspect": 1.5,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/223820717/1963795600/stock-photo-smiling-dentist-communicating-with-african-american-woman-while-checking-her-teeth-during-dental-1963795600.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb1.shutterstock.com/thumb_small/223820717/1963795600/stock-photo-smiling-dentist-communicating-with-african-american-woman-while-checking-her-teeth-during-dental-1963795600.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_large/223820717/1963795600/stock-photo-smiling-dentist-communicating-with-african-american-woman-while-checking-her-teeth-during-dental-1963795600.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/smiling-dentist-communicating-african-american-260nw-1963795600.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1963795600/watermark_1000/f9233c65df602edf8e2d5d491fcfed65/preview_1000-1963795600.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-smiling-dentist-communicating-with-african-american-woman-while-checking-her-teeth-during-dental-1963795600.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "223820717"
            },
            "description": "Smiling dentist communicating with African American woman while checking her teeth during dental procedure at dentist's office.",
            "image_type": "photo",
            "has_model_release": true,
            "media_type": "image"
        },
        {
            "id": "1864631416",
            "aspect": 1.4999,
            "assets": {
                "preview": {
                    "height": 300,
                    "url": "https://image.shutterstock.com/display_pic_with_logo/285585901/1864631416/stock-photo-portrait-of-a-healthy-and-happy-middle-aged-african-woman-living-with-hiv-1864631416.jpg",
                    "width": 450
                },
                "small_thumb": {
                    "height": 67,
                    "url": "https://thumb1.shutterstock.com/thumb_small/285585901/1864631416/stock-photo-portrait-of-a-healthy-and-happy-middle-aged-african-woman-living-with-hiv-1864631416.jpg",
                    "width": 100
                },
                "large_thumb": {
                    "height": 100,
                    "url": "https://thumb1.shutterstock.com/thumb_large/285585901/1864631416/stock-photo-portrait-of-a-healthy-and-happy-middle-aged-african-woman-living-with-hiv-1864631416.jpg",
                    "width": 150
                },
                "huge_thumb": {
                    "height": 260,
                    "url": "https://image.shutterstock.com/image-photo/portrait-healthy-happy-middleaged-african-260nw-1864631416.jpg",
                    "width": 390
                },
                "preview_1000": {
                    "url": "https://ak.picdn.net/shutterstock/photos/1864631416/watermark_1000/a74563fb512cd6de0a49826912608d2b/preview_1000-1864631416.jpg",
                    "width": 1000,
                    "height": 667
                },
                "preview_1500": {
                    "url": "https://image.shutterstock.com/z/stock-photo-portrait-of-a-healthy-and-happy-middle-aged-african-woman-living-with-hiv-1864631416.jpg",
                    "width": 1500,
                    "height": 1000
                }
            },
            "contributor": {
                "id": "285585901"
            },
            "description": "Portrait of a healthy and happy middle-aged African woman living with HIV",
            "image_type": "photo",
            "has_model_release": true,
            "media_type": "image"
        }
    ]
}"""

class ImagesApiTest {

    private var mockWebServer = MockWebServer()

    private lateinit var apiService: ApiInterface

    @Before
    fun setUp() {
        mockWebServer.start()


        apiService = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl(mockWebServer.url("/")) // note the URL is different from production one
            .build()
            .create(ApiInterface::class.java)
    }

    @After
    fun teardown() {
        mockWebServer.shutdown()
    }

    @Test
    fun testCompleteIntegration() = runBlocking { // that will allow to wait for coroutine
        mockWebServer.enqueue(
            MockResponse()
            .setResponseCode(HttpURLConnection.HTTP_OK)
            .setBody(response))

        val response = apiService.searchForImages(page = 1).await()
        assertEquals(true, response.isSuccessful)
        assertEquals(1, response.body()?.page)
        assertEquals(20, response.body()?.perPage)
    }
}