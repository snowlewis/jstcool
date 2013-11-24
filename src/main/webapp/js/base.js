var jsTemplate = (function () {
    var templateCache = {};

    function escapeTemplate(content) {
        return content == null ? "" : content.replace(/&lt;/g, "<").replace(/&gt;/g, ">");
    }

    function parseTemplate(templateId, data) {
        var template;
        if (templateCache[templateId]) {
            template = templateCache[templateId];
        }
        else {
            template = escapeTemplate($("#" + templateId).html());
            templateCache[templateId] = template;
            $("#" + templateId).remove();
        }
        return TrimPath.parseTemplate(template, templateId).process({model: data});
    }

    // Deprecated
    function mergeTemplate(clz, data) {
        if (data.length > 0) {
            var templateId = clz + "-template";
            $("." + clz).append(parseTemplate(templateId, data));
            $("." + clz).show();
        }
        else {
            $('#no-' + clz).show();
        }
    }

    function mergeAndShow(template, data, callback) {
        var mergedTemplate = TrimPath.parseTemplate(escapeTemplate(template), 'templateId').process({model: data});
        if (callback)
            callback(mergedTemplate);
        return mergedTemplate;
    }

    return {
        mergeTemplate: mergeTemplate,
        mergeAndShow: mergeAndShow
    }
})();
