# Animation Viewer

## Overview

This Java project creates an interactive graphical animation application. It allows users to visualize and interact with various geometric shapes, observing their animations along predefined paths.

## Features

- **Interactive Shapes**: Users can create and animate shapes such as rectangles and ovals.
- **Nested Shapes**: Support for nesting shapes within other shapes for complex animations.
- **Customizable Paths**: Shapes move along different paths, including bouncing, falling, and horizontal movements.
- **Dynamic Interaction**: Shapes can be dynamically added, removed, or customized through the graphical interface.

## Project Structure

- `AnimationViewer.java`: The main GUI component initializing and running the application.
- `Shape.java`: Abstract class representing the basic functionalities of shapes.
- `RectangleShape.java` & `OvalShape.java`: Concrete implementations of different shapes.
- `NestedShape.java`: Enables nesting of multiple shapes.
- `GraphicsPainter.java` & `Painter.java`: Handles the drawing and painting of shapes onto the canvas.
- `PathType.java`: Enum defining possible path movements for shapes.
- `ShapeType.java`: Enum defining available shape types.
- `A3.java`: Main entry point to launch the application.

## How to Run

1. Clone this repository to your local machine.
2. Compile the Java files:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java A3
   ```

## Requirements

- Java SE 8 or higher
- Java Swing (included in Java SE)

## Usage

- **Add Shape**: Select shape type and path from the dropdown menus and click "Add".
- **Animate**: Click "Start" to begin animation and "Stop" to pause.
- **Interactive Controls**: Use the mouse to interact and reposition shapes.

## Contributions

Contributions to enhance features or fix issues are welcome. Please fork the repository and submit a pull request.

## License

This project is open source and available under the MIT License.

