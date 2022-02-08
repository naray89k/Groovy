/*
    Maps
    
    Create a map of days of the week
        1: Sunday, 2:Monday, etc...
    Print out the map
    Print out the class name of the map
    Print the size of the map
    Is there a method that would easily print out all of the days (values)? 
    Without closures you may have to look at the Java API for LinkedHashMap
*/

Map week_map = [1:"Sunday",2:"Monday",3:"Tuesday",4:"Wednesday",5:"Thursday",6:"Friday",7:"Saturday"]
println week_map
println week_map.getClass().getName()
println week_map.size()
println week_map.values()

// traversing map
println("Traversing a map")
for (elem in week_map)
  println("$elem.key, $elem.value")


def sampleMap = [:]
sampleMap.put('thickness', 10)
sampleMap['color'] = 'Blue'
sampleMap.weight = 500
sampleMap.'shape' = 'Circle'
sampleMap << [price:150]
sampleMap.validity = 24

println(sampleMap)

sampleMap.each {
  key, value ->
    println("Key: $key & Value:$value")
}

keySet = sampleMap.keySet()
println(keySet.getClass().getName())

for (elem in sampleMap.keySet())
  println(elem)
