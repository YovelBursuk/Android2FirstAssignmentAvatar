package com.example.myapplicationrecyclerview.data

import com.example.myapplicationrecyclerview.models.BlogPost

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<BlogPost> {
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    0,
                    "Aang",
                    "Aang was a male Air Nomad born in 12 BG and the Avatar during the Hundred Year War, succeeding Avatar Roku and preceding Avatar Korra",
                    "https://static.wikia.nocookie.net/avatar/images/a/ae/Aang_at_Jasmine_Dragon.png/revision/latest?cb=20130612174003",
                    "https://static.wikia.nocookie.net/avatar/images/6/6b/Adult_Aang.png/revision/latest?cb=20170709183126",
                    "Yovel Bursuk"
                )
            )
            list.add(
                BlogPost(
                    1,
                    "Katara",
                    "Katara is a waterbending master, born in the Southern Water Tribe to Chief Hakoda and his wife Kya.",
                    "https://static.wikia.nocookie.net/avatar/images/7/7a/Katara_smiles_at_coronation.png/revision/latest?cb=20150104171449",
                    "https://static.wikia.nocookie.net/avatar/images/f/f1/Elderly_Katara.png/revision/latest?cb=20121107122506",
                    "Idan Mashiach"
                )
            )

            list.add(
                BlogPost(
                    2,
                    "Sokka",
                    "Sokka was a Water Tribe warrior of the Southern Water Tribe and the son of Chief Hakoda and Kya.",
                    "https://static.wikia.nocookie.net/avatar/images/c/cc/Sokka.png/revision/latest?cb=20140905085428",
                    "https://static.wikia.nocookie.net/avatar/images/2/27/Older_Sokka.png/revision/latest?cb=20170709185330",
                    "Yovel Bursuk"
                )
            )
            list.add(
                BlogPost(
                    3,
                    "Zuko",
                    "Zuko is a firebending master, born as a prince in the Fire Nation Royal Family, who reigned as Fire Lord from 100 AG until his abdication in 167 AG",
                    "https://static.wikia.nocookie.net/avatar/images/4/4b/Zuko.png/revision/latest?cb=20180630112142",
                    "https://static.wikia.nocookie.net/avatar/images/8/8d/Elderly_Zuko.png/revision/latest?cb=20170709180249",
                    "Idan Mashiach"
                )
            )
            list.add(
                BlogPost(
                    4,
                    "Toph Beifong",
                    "Toph Beifong is an earthbending master, one of the most powerful of her time, and the discoverer of metalbending.",
                    "https://static.wikia.nocookie.net/avatar/images/4/46/Toph_Beifong.png/revision/latest?cb=20131230122047",
                    "https://static.wikia.nocookie.net/avatar/images/8/8e/Elderly_Toph.png/revision/latest?cb=20150408124556",
                    "Yovel Bursuk"
                )
            )
            return list
        }
    }
}