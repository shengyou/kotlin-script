#!/usr/bin/env kotlinc -script

import java.io.File

val files = File(args[0]).listFiles { file -> file.isFile }
val time = System.currentTimeMillis() - args[1] * 24 * 60 * 60 * 100

files?.filter { it.lastModified() < time }?.forEach { it.delete() }
