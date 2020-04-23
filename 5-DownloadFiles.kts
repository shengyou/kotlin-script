#!/usr/bin/env kotlinc -script

import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

for (i in 1..10) {
    println("Donwloading $i file...")
    val stream = URL("https://picsum.photos/200/200").openStream()
    val path = Paths.get("downloads/Image-$i.jpg")
    Files.copy(stream, path)
}
