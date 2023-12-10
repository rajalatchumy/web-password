$(document).ready(function() {
  $('#login-form').submit(function(event) {
    event.preventDefault(); // prevent default form submission

    var login = $('#login').val();
    var password = $('#password').val();

    $.ajax({
      url: 'LoginServlet',
      type: 'POST',
      data: { login: login, password: password },
      success: function(response) {
        if (response === '1') {
          $('#result').text('Login successful.');
        } else {
          $('#result').text('Invalid login or password.');
        }
      },
      error: function() {
        $('#result').text('Error occurred while processing the request.');
      }
    });
  });
});
