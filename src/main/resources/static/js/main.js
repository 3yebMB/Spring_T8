/**
 * Created by EVDOKIMOVAL on 30.08.2018.
 * added by 3yebMB on 27.02.2019
 */
$(document).ready(function() {
    $('#btnHello').click(function (e) {
        console.log('Hello');
    });
    $('#btnHello').toggleClass( "btn btn-primary" )

    $('#btnHello').click(function (e) {
        $.post("/about/test_param", {
            name_param: $('#newTestParam').val()
        }).done(function (result) {
            location.reload();
        });
        // console.log($('#newCustomerName').val());
    });

    $('#btnBlank').click(function (e) {
            $.post("/blank/blank_param", {
                name_param: $('#newBlankParam').val()
            }).done(function (result) {
                location.reload();
            });
             console.log($('#newCustomerName').val());
        });
});