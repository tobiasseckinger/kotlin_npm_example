const path = require('path');

module.exports = {
  mode: 'development',
  entry: './src/main/resources/static/js/main.js', // Haupt-JavaScript-Datei
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, 'src/main/resources/static/dist')
  },
  module: {
          rules: [
              {
                  test: /\.worker\.js$/,
                  use: { loader: 'file-loader' }
              }
          ]
      }
};
