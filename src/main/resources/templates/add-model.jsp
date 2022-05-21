<!DOCTYPE html>
<html lang="en"
      xmlns:th="http://www.thymleaf.org"
>
<head>
    <meta charset="UTF-8">
    <title>New Model</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">Add new model</h5>
            <form action="#" th:action="@{/add-model}" th:object="${model}" method="post">
                <label for="name">Name</label>
                <input type="text" th:field="*{name}" id="name" placeholder="Model Name">
                <label for="supplier">Supplier</label>
                <select class="form-select" aria-label="Default select example" id="supplier" th:field="*{id}">
                    <option value="NULL">Select the supplier</option>
                    <option  th:each="s:${suppliers}" th:value="${s.id}" th:text="${s.name}"></option>
                </select>
                <input type="submit" value="Add model">
            </form>
        </div>
    </div>
</body>
</html>