<div class="row">
    <div class="col-md-6 col-12 form-group">
        <label>
            显示
            <select name="sizex" class="form-control form-control-sm">
                <option value="5">5</option>
                <option value="10">10</option>
                <option value="25">25</option>
                <option value="50">50</option>
                <option value="100">100</option>
            </select>
            条
        </label>
        ，共${query.pages}页，共${query.total}条
<#--        ，共${10}页，共${10}条-->
    </div>
    <div class="col-md-6 col-12 d-flex justify-content-end">
        <ul class="pagination">

        </ul>
    </div>
</div>