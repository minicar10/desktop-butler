package com.butler;

import java.io.IOException;
import java.nio.file.*;

public class FileOperations {
    /**
     * Implements transactional safety for file moves as noted in resume.
     * Uses ATOMIC_MOVE where supported to prevent partial writes.
     */
    public static void safeMove(Path source, Path target) {
        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
            System.out.println("Successfully organized: " + source.getFileName());
        } catch (IOException e) {
            // Handle transaction errors as per project specs
            System.err.println("Critical Error: Transaction failed for " + source.getFileName() + " - " + e.getMessage());
        }
    }
}
