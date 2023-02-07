package pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileOperationPerformer {
    private final List<FileOperation> operationHistory = new ArrayList<>();

    public String executeOperation(FileOperation operation, String content) {
        operationHistory.add(operation);
        return operation.performOperation(content);
    }

    public List<FileOperation> getOperationHistory() {
        return operationHistory.stream()
                .collect(Collectors.toUnmodifiableList());
    }
}
