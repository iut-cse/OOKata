const path = require('path');

module.exports = (env, options) => {
    console.log(`This is the Webpack 4 'mode': ${options.mode}`);
    let entryFileSuffix = options.mode === 'development' ? 'dev' : 'prod';
    let entryFile = `./src/app.${entryFileSuffix}.ts`;
    return {
        entry: entryFile,
        devtool: '',
        output: {
            filename: 'bundle.js',
            path: path.resolve(__dirname, 'dist')
        },
        module: {
            rules: [{
                test: /\.(scss)$/,
                use: [{
                    loader: 'style-loader'
                }, {
                    loader: 'css-loader'
                }, {
                    loader: 'postcss-loader',
                    options: {
                        plugins: function () {
                            return [
                                require('autoprefixer')
                            ];
                        }
                    }
                }, {
                    loader: 'sass-loader'
                }]
            }, {
                test: /\.tsx?$/,
                use: 'ts-loader',
                exclude: /node_modules/,
            }]
        },
        resolve: {
            extensions: ['.tsx', '.ts', '.js'],
        },
    };
}