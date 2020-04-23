#!/usr/bin/env kotlinc -script

import java.io.File

val files = File("files").listFiles { file -> file.isFile }
val time = System.currentTimeMillis() - 1 * 24 * 60 * 60 * 100

files?.filter { it.lastModified() < time }?.forEach { it.delete() }
