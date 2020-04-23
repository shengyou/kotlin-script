#!/usr/bin/env kscript

@file:DependsOn("com.github.holgerbrandl:kscript-support:1.2.4")

import kscript.text.*

val lines = resolveArgFile(args)

// Delete trailing white space (spaces, tabs)
//awk '{sub(/[ \t]*$/, "");print}' data/some_flights.tsv
//lines.map { it.trim() }.print()

// Selecting columns
// awk '{print $10, $1, $12}' data/some_flights.tsv
//lines.split().select(10, 1, 12).print()

// Add a new column
// awk '{print $1, $2, "F11-"$7}' some_flights.tsv
//lines.split().map { listOf(it[1], it[2], "F11-"+ it[7]) }.print()

// Delete a column
// awk '!($3="")' data/some_flights.tsv
//lines.split().selectByName(-3).print()
