# The ***equals*** Method
The examples are from *Effective Java - Third Edition* by Joshua Bloch.

The problem occurs when we implement the ``equals`` method in inheritance.
The equal comparison between the superclass and the subclasses is not well achievable when there is a new value component.
In other words, the general contract of the ``equals`` method cannot be achieved.

However, the best workaround suggested is following the OO principle, "Favor composition over inheritance."
The example is in ``org.saturdaystudy.demo.equals.ComposedColorPoint``.

*Note*: Always override ``hashcode`` when you override ``equals``. 