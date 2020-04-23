#!/usr/bin/env kotlinc -script

println("Script is running with ${args.size} args passed")
for (arg in args) {
    println("arg: $arg")
}

println("Script is running with ${args.size} args passed")
args.forEach {
    println("arg: $it")
}
