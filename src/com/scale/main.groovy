package com.scale

// Test script file to run commands on classes

// Write terminal commands to get new candidate data
def id = 123
def positionPosted = 'Engineer'
def experience = 6

Candidate can1 = new Candidate(iD: id, position: positionPosted, yearsExperience: experience)

println 'Candidate Profile:'
println can1.getiD()
println can1.getPosition()
println can1.getYearsExperience()