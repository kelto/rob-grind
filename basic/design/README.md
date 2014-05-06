# Basic of design

## IS/HAS

In Object Paradigm, there is two possible relationship : IS and HAS. The IS relationship is done through inheritence, while the HAS relationship is done by referencing another object.

Mainly the question to ask to know which relationship to use is : "Is it the same kind, or do it own it ?".
For a more practical approach, you can wonder if you want to extends/specialize the object, or if you want to use it.
To extends or specialize an object => inheritence.
To use an Object => HAS relationship (aggregation, association, etc ...).

The HAS relationship is really easy to implement : create an attribute of this Object.
When multiple instance need to be stock : use a Collection object (ArrayList, LinkedList, etc ....)
