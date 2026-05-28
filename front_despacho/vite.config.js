import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react-swc'

export default defineConfig({
  plugins: [react()],
  server: {
    proxy: {
      '/api/ventas': {
        target: 'http://10.0.133.210:8082',
        changeOrigin: true,
        secure: false,
        rewrite: (path) => path.replace(/^\/api\/ventas/, '')
      },

      '/api/despachos': {
        target: 'http://10.0.133.210:8081',
        changeOrigin: true,
        secure: false,
        rewrite: (path) => path.replace(/^\/api\/despachos/, '')
      }
    }
  }
})