# Final Project – Minecraft Mod + Whiteboard Application

## Overview

For my final project, I am submitting **two related code projects**:

1. A **Minecraft mod** that adds a collection of custom items/blocks.
2. A **Java Whiteboard application** that demonstrates GUI programming, event handling, and basic drawing tools.

Due to technical issues with the Minecraft mod (described below), I was not able to fully meet all of the original requirements (specifically: custom crafting recipes and loot tables). To still demonstrate my understanding of Java, object-oriented programming, and event-driven design, I expanded and refined my older Whiteboard project and am submitting both together.

This README explains:

- What each project does
- How each project relates to the assignment requirements
- What is working vs. what is not working
- What I would do next with more time

---

## Part 1 – Minecraft Mod

### Project Description

This project is a custom Minecraft mod that adds multiple new items and/or blocks to the game. The goal was to:

- Design and implement at least **15 custom items/blocks**
- Add at least **2 custom crafting recipes**
- Implement **loot tables** so the new content can be found/obtained in-game

### Features Implemented

- ✅ **Custom items/blocks**
  - Implemented 7 custom blocks and 2 custom items.
  - Registered these items/blocks so they appear in the game (creative menu / item registry).
  - Created custom textures/models using libreSprite.

- ✅ **Project structure and build system**
  - Set up a semi working mod project with the correct directory structure.
  - Successfully built and ran the mod in the development environment with the new content visible in-game.

### Requirements Coverage (Minecraft Mod)

> Adjust the wording to match your exact rubric, but this is the idea.

- **Requirement: 15 custom items/blocks**
  - **Status:** *Not Met*
  - With only 9 custom items/blocks total, I did not meet the requirement.

- **Requirement: At least 2 custom crafting recipes**
  - **Status:** *Not met (attempted but not working)*
  - I created JSON recipe files (e.g., `hand_cannon.json`) in what I believe is the correct directory structure.
  - Despite matching my instructor’s example and other documentation, the recipes do not show up or function in the game.
  - I spent multiple days troubleshooting with online help and AI tools but was unable to resolve the issue; it may be related to version/JDK/mod-loader differences, but I could not confirm this in time.
  - I left a single recipe in what should be a working directory. I am hoping that this may work better in your IDE.

- **Requirement: Loot tables**
  - **Status:** *Not met (attempted)*
  - I attempted to define loot tables so that the custom items/blocks could drop naturally (e.g., from chests/mobs/blocks).
  - Similar to the recipe issue, the loot tables were not being picked up in-game, and I was unable to debug the exact cause before the deadline.
  - Loot tables and recipes were wiped from my mod file when I restored an older version.

- **Other elective/extra requirements**
  - **Status:** *Partially met*
  - hand_cannon - maximum velocity projectile / custom texture/ custom knockback effect / custom sound effect / spawns TNT where the arrow lands
  - sword_0 - custom knockback effect / custom texture / spawns TNT at the target location
  - I did complete additional work around item/block design and project setup, but because the core recipe/loot-table functionality was not working, I focused my remaining time on the Whiteboard project described below.

### Known Issues (Minecraft Mod)

- Custom **recipes** do not appear or function in-game.
- Custom **loot tables** are not loading, so the new items/blocks can’t be naturally obtained as intended.
- Limited time prevented further mod development and deeper debugging (e.g., checking for subtle version mismatches, data pack naming conventions, or loader configuration problems).

### What I Learned (Minecraft Mod)

Even though the mod is incomplete, I learned:

- How to set up a Java-based Minecraft mod project and work with the modding toolchain.
- How to register new game content (items/blocks) and provide textures/models.
- How data-driven assets like recipes and loot tables are supposed to be structured, even though I couldn’t get them fully working.
- How to work with json, gradle, and Minecraft databases.

If I had more time, I would focus on:

- Verifying version compatibility between the mod loader, Minecraft version, and JDK.
- Using logs/debugger to trace exactly why the recipe/loot JSON files are not being loaded.
- Adding more custom items. (A "House" block texture pack was my original idea.)
- Finishing the loot table integration and balancing how items are obtained in survival mode.

---

## Part 2 – Java Whiteboard Application

### Project Description

The Whiteboard application is a standalone Java Swing GUI program that allows the user to draw on a canvas, similar to a simple paint/whiteboard tool. I started this project earlier in the semester and returned to it to polish the design and use it as a second part of my final.

The application demonstrates:

- Java GUI programming using a large existing code base (Swing)
- Event-driven programming with mouse listeners
- Drawing on a custom component (canvas)
- Basic state management for drawing and UI controls
- Evaluating performance and stability of a program, and implement improvements

### Main Features

- ✅ **Drawing canvas**
  - A central panel that acts as a whiteboard where the user can draw with the mouse.

- ✅ **Basic tools / controls**
  - GUI buttons/controls for things like:
    - Clearing the canvas
    - Selecting brush color
    - Adjusting brush size

- ✅ **Mouse-based drawing**
  - The user can click and drag the mouse to draw strokes on the canvas.
  - Uses mouse events (pressed, dragged, released) to track drawing.

- ✅ **Updated / modernized UI**
  - Designed the UI to make it look more modern and readable:
    - Used Nimbus look and feel for the UI
    - Organized buttons into panels, and added labels to clarify their purpose
    - Added several options for brush size and color selection
    - Improved layout and spacing of controls
    - Added colors to 'Brush Color' buttons

### Minor improvements
- Re-designed the UI to make it more modern, readable, and accessible
- Implemented a buffer resizing logic for the drawing canvas (prevents memory leaks and glitchiness)
- Implemented Nimbus look and feel for the UI
- Added anti-aliasing to lines
- Moved the drawing logic from the paintComponent() method to the mouseDragged() method for better performance

### Requirements Coverage (Whiteboard App)

This project helps demonstrate that I met (or partially met) course objectives around:

- **Java syntax and OOP**
  - Uses multiple classes, objects, and fields/methods to structure the app.
- **Event-driven programming**
  - Relies on listeners for mouse input and button actions.
- **GUI programming**
  - Builds a window/frame with panels, buttons, and a custom drawing surface.
- **Code organization and readability**
  - Refactored code to separate concerns (e.g., UI setup vs. drawing logic) and make it more maintainable.

Even though this was not the originally planned final project, it meets a lot of the same learning outcomes as the Minecraft mod, especially in terms of Java and GUI/event handling skills.

### Known Limitations (Whiteboard App)

- No persistent file saving/loading of drawings.
- No advanced features like layers, shapes libraries, or undo/redo.
- Focused on core drawing functionality and UI instead of advanced graphics features.

---

## Reflection

While I was not able to fully complete the **Minecraft mod** to the specification (specifically crafting recipes and loot tables), I did:

- Implement and register the required number of custom items/blocks.
- Gain experience working with a complex Java-based game/modding environment.
- Spend significant time debugging and trying to resolve data-driven issues.

To make sure my final still demonstrates my skills and effort in this course, I polished and submitted my **Whiteboard application** as a second project. This application:

- Shows my understanding of Java, OOP, and event-driven GUI programming.
- Represents a complete, working piece of software that a user can run and interact with.
- Reflects improvements I made after revisiting and refactoring older code.

Together, these two projects show my ability to:

- Set up and work in different Java environments (game modding vs. standalone app).
- Design and implement user-facing features.
- Troubleshoot and adapt when a project hits technical roadblocks.
