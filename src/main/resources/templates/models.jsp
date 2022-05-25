<!DOCTYPE html>
<html lang="en"
      xmlns:th="http://www.thymleaf.org"
>
<head>
    <meta charset="UTF-8">
    <title>Models</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="webjars/bootstrap-icons/1.8.2/font/bootstrap-icons.css">
</head>
<body>
    <table class="table table-striped table-hover table-sm">
        <thead class="thead-light">
            <tr>
                <th th:if="${false}">Id</th>
                <th>Name</th>
                <th>Supplier</th>
                <th>Actions</th>
            </tr>
            <tr>
                <th th:if="${false}" th:text="est"></th>
                <th>
                    <form id="modelForm" action="#" th:action="@{/models}" method="get">
                        <div class="input-group">
                            <div class="input-group-prepend col-xs-2">
                                <button id="name-submit" class="input-group-text" type="submit" >&#x1F50D;</button>
                            </div>
                            <input type="text" class="form-control" placeholder="Chercher" aria-label="Name" name="name" th:value="${name}">
                            <input th:if="${supplier != null && supplier !=''}" type="hidden" th:value="${supplier}">
                        </div>
                    </form>
                </th>
                <th>
                    <form id="supplierForm" action="#" th:action="@{/models}" method="get" th:object="${supplier}">
                        <div  class="input-group">
                            <div class="input-group-prepend">
                                <button id="supplier-submit" class="input-group-text" type="submit" >&#x1F50D;</button>
                            </div>
                            <select class="form-select" name="supplier" >
                                <option value="">Select one supplier</option>
                                <option th:each="sup:${suppliers}" th:value="${sup.name}" th:text="${sup.name}" th:selected="${sup.name} == ${supplier}"></option>
                            </select>
                            <input th:if="${name != null && name !=''}" type="text" th:value="${name}">
                        </div>
                    </form>
                </th>
                <th><button type="button" class="btn btn-primary"><i class="bi bi-plus-square"></i> Add model</button></th>
            </tr>
        </thead>
        <tbody>
            <tr th:each="m:${models}">
                <td th:if="${false}" th:text="${m.id}"></td>
                <td th:text="${m.name}"></td>
                <td th:text="${m.supplier.name}"></td>
                <td>
                    <a type="button" class="btn"><i class="bi bi-eye-fill"></i></a>
                    <a type="button" class="btn"><i class="bi bi-pencil-fill text-success"></i></a>
                    <a type="button" class="btn" th:href="@{/delete-model(id=${m.id})}"><i class="bi bi-trash-fill text-danger"></i></a>
                </td>
            </tr>
        </tbody>
    </table>
    <nav aria-label="Pagination" th:if="${totalPages != null && totalPages.size() > 0}">
        <ul class="pagination">
            <li class="page-item disabled" th:if="${currentPage.number == 0}">
                <span class="page-link" >&laquo;</span>
            </li>
            <li class="page-item" th:if="${currentPage.number > 0}">
                <a class="page-link" th:href="@{/models(page=${currentPage.number - 1})}">&laquo;</a>
            </li>
            <li th:each="p:${totalPages}" class="page-item" th:classappend="${p == currentPage.number } ? active">
                <span th:if="${p == currentPage.number }" class="page-link disabled"  th:text="${p + 1}"></span>
                <a th:if="${p != currentPage.number && name != '' && name != null}" class="page-link" th:text="${p + 1}" th:href="@{/models(page=${p + 1}, name=${name})}"></a>
                <a th:if="${p != currentPage.number && (name == '' || name == null)}" class="page-link" th:text="${p + 1}" th:href="@{/models(page=${p + 1})}"></a>
            </li>
            <li class="page-item disabled" th:if="${currentPage.number == totalPages.size() - 1}">
                <span class="page-link">&raquo;</span>
            </li>
            <li class="page-item" th:if="${currentPage.number < totalPages.size() - 1}">
                <a class="page-link" th:href="@{/models(page=${currentPage.number + 1})}">&raquo;</a>
            </li>
        </ul>
    </nav>
</body>
</html>