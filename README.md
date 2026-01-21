# Desktop Butler

Desktop Butler is a local productivity tool that automates file organization
using event-driven directory monitoring and user-defined rules.

---

## Features
- Event-driven file system monitoring (no polling)
- Rule-based file categorization by extension or name
- Batch renaming using regular expressions
- Safe, local file operations with error handling
- Extensible design for future UI and rule support

---

## Tech Stack
- Java (NIO.2 `WatchService`)
- Node.js (utility scripting, planned)
- React (configuration UI, planned)

---

## How It Works
1. Monitors a target directory for file creation events
2. Applies user-defined rules to classify files
3. Renames or moves files using safe file operations
4. Logs actions for transparency and debugging

---

## Notes
This project is a personal productivity and systems programming exercise.
It is under active development and not intended for production use.
